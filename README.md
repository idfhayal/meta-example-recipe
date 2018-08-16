This README file contains information on the contents of the
example-recipe layer.

Please see the corresponding sections below for details.


Dependencies
============

This layer depends on:

  URI: git://git.openembedded.org/bitbake
  branch: master

  URI: git://git.openembedded.org/openembedded-core
  layers: meta
  branch: master

  URI: git://git.yoctoproject.org/xxxx
  layers: xxxx
  branch: master


Patches
=======

Please submit any patches against the example-recipe layer to the
xxxx mailing list (xxxx@zzzz.org) and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>


Table of Contents
=================

  I. Adding the example-recipe layer to your build
 II. Misc


I. Adding the example-recipe layer to your build
=================================================

--- replace with specific instructions for the example-recipe layer ---

In order to use this layer, you need to make the build system aware of
it.

Assuming the example-recipe layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the example-recipe layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-example-recipe \
    "


II. Misc
========

--- replace with specific information about the example-recipe layer ---
