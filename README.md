<img src="media/logo/ic_app.png" height="100px" />

Android Device Info
=============

[![Travis CI](https://travis-ci.org/fartem/android-device-info.svg?branch=master)](https://travis-ci.org/fartem/android-device-info)
[![Codebeat](https://codebeat.co/badges/6abea524-2c73-4dae-9b49-4dc69438480a)](https://codebeat.co/projects/github-com-fartem-android-device-info-master)
[![Codecov](https://codecov.io/gh/fartem/android-remote-temperature-control-client/branch/master/graph/badge.svg)](https://codecov.io/gh/fartem/android-remote-temperature-control-client)
[![Hits-of-Code](https://hitsofcode.com/github/fartem/android-device-info)](https://hitsofcode.com/view/github/fartem/android-device-info)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Device%20Info-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/7904)

About
-------------

Demonstration app for displaying information about Android device.

__Available information about device__

| Section | Values |
| --- | --- |
| System | Api Level, Arch, Board, Bootloader, Brand, Code Name, Date, Fingerprint, Hardware, Host, Kernel Version, Manufacturer, Model, Product, Release Version, Type, User |
| Cpu | Cores, Frequency |
| Gpu | Model, Vendor |
| JVM | JVM |
| RAM | Available RAM, Total RAM |
| Battery | Health, Action, Plugged |
| Display | Density DPI, Density, Display, Height Pixels, Scaled Density DPI, Width Pixels, XDPI, YDPI |

Downloads
-------------

<img src="media/qrcodes/github_download.png" height="150px" />

Screenshots
-------------

<br/>
<p align="center">
  <img src="media/screenshots/screenshot_01.png" width="150" />
  <img src="media/screenshots/screenshot_02.png" width="150" />
  <img src="media/screenshots/screenshot_03.png" width="150" />
  <img src="media/screenshots/screenshot_04.png" width="150" />
  <img src="media/screenshots/screenshot_05.png" width="150" />
</p>

How to contribute
-------------

Read [Commit Convention](https://github.com/fartem/repository-rules/blob/master/commit-convention/COMMIT_CONVENTION.md). Make sure your build is green before you contribute your pull request. Then:

```shell
gradlew clean
gradlew build
gradlew -Pandroid.testInstrumentationRunnerArguments.class=com.smlnskgmail.jaman.deviceinfo.info.travisci.Api22TestSuite connectedCheck
```

If you don't see any error messages, submit your pull request.

Contributors
-------------

* [@fartem](https://github.com/fartem) as Artem Fomchenkov