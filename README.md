# Do


### Initialize Object then set its properties.

##### How to use?

```kotlin
        val layout = LinearLayout(this).then {
            it.setBackgroundColor(Color.RED)
            it.orientation = LinearLayout.HORIZONTAL
            it.gravity = Gravity.CENTER
        }
        val view = TextView(this).then {
            it.text = getString(R.string.app_name)
            it.setTextColor(Color.WHITE)
            it.layoutParams = ViewGroup.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
        }
```

## LICENSE

    Copyright 2017 adgvcxz

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

