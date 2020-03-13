<img src="media/logo/ic_app.png" height="100px" />

Android Device Info
=============

[![Travis CI](https://img.shields.io/travis/fartem/android-device-info)](https://travis-ci.org/fartem/android-device-info)
[![Codecov](https://img.shields.io/codecov/c/github/fartem/android-device-info)](https://codecov.io/gh/fartem/android-device-info)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Device%20Info-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/7904)
[![Open issues](https://img.shields.io/github/issues-raw/fartem/android-device-info.svg?color=ff534a)](https://github.com/fartem/android-device-info/issues)

About
-------------

Demonstration app for displaying information about Android device.

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