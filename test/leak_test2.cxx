#include <sstream>
#include <cstdlib>
#include <napi.h>
#include <unistd.h>

#define PSZ(s) (s).c_str()

const int nFiles = 10;
const int nEntry = 10;
const int nData = 10;
int array_dims[2] = {5, 4};
short int i2_array[4] = {1000, 2000, 3000, 4000}; int iFile, iReOpen, iEntry, iData, iNXdata, iSimpleArraySize = 4; 

int main (int argc, char* argv[])
{
    printf("Running for %d iterations\n", nFiles);
    NXaccess access_mode = NXACC_CREATE5;
    char strFile[512];
        for( iFile = 0; iFile < nFiles; iFile++ )
        {
                sprintf(strFile, "leak_test2_%03d.nxs", iFile);
                remove(strFile);
                printf("file %s\n", strFile);
                NXhandle fileid;
                if (NXopen(strFile, access_mode, &fileid) != NX_OK) return 1;

                for( iEntry = 0; iEntry < nEntry; iEntry++ )
                {
                        std::ostringstream oss;
                oss << "entry_" << iEntry;
                        if (NXmakegroup (fileid, PSZ(oss.str()), "NXentry") != NX_OK) return 1;
                        if (NXopengroup (fileid, PSZ(oss.str()), "NXentry") != NX_OK) return 1;
                        for( iNXdata = 0; iNXdata < nData; iNXdata++ )
                        {
                                std::ostringstream oss;
                                oss << "data_" << iNXdata;
                                if (NXmakegroup (fileid, PSZ(oss.str()), "NXdata") != NX_OK) return 1;
                                if (NXopengroup (fileid, PSZ(oss.str()), "NXdata") != NX_OK) return 1;
                                for( iData = 0; iData < nData; iData++ )
                                {
                                        std::ostringstream oss;
                                        oss << "i2_data_" << iData;
                                        if (NXmakedata (fileid, PSZ(oss.str()), NX_INT16, 1, &array_dims[1]) != NX_OK) return 1;
                                        if (NXopendata (fileid, PSZ(oss.str())) != NX_OK) return 1;
                                        if (NXputdata (fileid, i2_array) != NX_OK) return 1;
                                        if (NXclosedata (fileid) != NX_OK) return 1;
                                }
                                if (NXclosegroup (fileid) != NX_OK) return 1;
                        }
                        if (NXclosegroup (fileid) != NX_OK) return 1;
                }
                if (NXclose (&fileid) != NX_OK) return 1;
		fileid = NULL;

                // Delete file
                remove(strFile);
        }
	_exit(EXIT_FAILURE);
	return 0;
}

