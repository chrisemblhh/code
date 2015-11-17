## Process this file with cmake
#==============================================================================
#  NeXus - Neutron & X-ray Common Data Format
#
#  CMakeLists for building the NeXus library and applications.
#
#  Copyright (C) 2015 NeXus International Advisory Committee
#
#  This library is free software; you can redistribute it and/or modify it under
#  the terms of the GNU Lesser General Public License as published by the Free
#  Software Foundation; either version 2 of the License, or (at your option) any
#  later version.
#
#  This library is distributed in the hope that it will be useful, but WITHOUT
#  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
#  FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
#  details.
#
#  You should have received a copy of the GNU Lesser General Public License
#  along with this library; if not, write to the Free Software Foundation, Inc.,
#  59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
#
#  For further information, see <http://www.nexusformat.org>
#
#
#==============================================================================

#Make NeXus F03 Bindings Static Library

set (F03_SOURCES NXmodule.f90)

set_source_files_properties(${F03_SOURCES} PROPERTIES COMPILE_FLAGS "--std=f2003")

#------------------------------------------------------------------------------
# build static library for Fortran2003 bindings
#------------------------------------------------------------------------------

add_library (NeXus_F03_Static_Library STATIC ${F03_SOURCES})
set_target_properties(NeXus_F03_Static_Library PROPERTIES OUTPUT_NAME NeXus03)
target_link_libraries(NeXus_F03_Static_Library NeXus_Static_Library)

#------------------------------------------------------------------------------
# build shared library for Fortran2003 bindings
#------------------------------------------------------------------------------

add_library (NeXus_F03_Shared_Library SHARED ${F03_SOURCES})

#Note - library version needs to be got from somewhere?
set_target_properties(NeXus_F03_Shared_Library PROPERTIES 
                      OUTPUT_NAME NeXus03
                      VERSION "${NAPI_VERSION}"
                      SOVERSION ${NEXUS_SONAME})

target_link_libraries(NeXus_F03_Shared_Library NeXus_Shared_Library )

install (TARGETS NeXus_F03_Static_Library NeXus_F03_Shared_Library
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR} COMPONENT Runtime
    ARCHIVE DESTINATION ${CMAKE_INSTALL_LIBDIR}/nexus COMPONENT Development)
