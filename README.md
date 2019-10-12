# Android Device Info

Demonstration app for displaying some information about Android device.

## 1. Status

In development. Main functionality (collecting information about device) is fully integrated.

## 2. Tests

### 2.1. Test

Suite class: `StructureTestSuite`.

| Order | Class | Status | Description |
| --- | --- | --- | --- |
| 1 | `FakeInfoStringResultTest` | Pass | Testing info string result |
| 2 | `FakeInfoIntResultTest` | Pass | Testing info int result |
| 3 | `BatteryInfoTest` | Pass | Testing battery info structure |
| 4 | `CPUInfoTest` | Pass | Testing CPU info structure |
| 5 | `DisplayInfoTest` | Pass | Testing display info structure |
| 6 | `GPUIInfoTest` | Pass | Testing GPU info structure |
| 7 | `JVMInfoTest` | Pass | Testing JVM info structure |
| 8 | `RAMInfoTest` | Pass | Testing RAM info structure |
| 9 | `SystemInfoTest` | Pass | Testing system info structure |

### 2.2. AndroidTest

Tests in this section passed only on `Google Pixel` emulator on `Android 9`.

Suite class: `Api27TestSuite`.

| Order | Class | Status | Description |
| --- | --- | --- | --- |
| 1 | `PixelApi27InfoTest` | Pass | Testing device info collecting on emulator |
| 2 | `PixelApi27UITest` | Pass | Testing UI structure |

## 3. Screenshots

<br/>
<p align="center">
  <img src="media/screenshot_01.png" width="190" />
  <img src="media/screenshot_02.png" width="190" />
  <img src="media/screenshot_03.png" width="190" />
  <img src="media/screenshot_04.png" width="190" />
</p>

<br/>
<p align="center">
  <img src="media/screenshot_05.png" width="190" />
  <img src="media/screenshot_06.png" width="190" />
  <img src="media/screenshot_07.png" width="190" />
</p>
