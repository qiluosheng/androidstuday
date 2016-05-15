- 从github上下载`SlidingMenu-master.zip`解压
- 将其中的`library`解压library改名为SlidingMenu
- 在AS中通过Import Module的方式导入库：File--New--Import Module
- 修改SlidingMenu里的build.gradle文件

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.0.0'//必须改
    }
}
apply plugin: 'android-library'
dependencies {
    compile 'com.android.support:appcompat-v7:23.3.0'//修改
}
android {
    compileSdkVersion 23//参考learning-android项目做了修改
    buildToolsVersion "23.0.3"//必须改，这里是参考app目录里的build.gradle改的
    defaultConfig {
        minSdkVersion 15//参考learning-android项目做了修改
        targetSdkVersion 23//参考learning-android项目做了修改
    }
    sourceSets {
        main {
            java.srcDirs = ['src']
            resources.srcDirs = ['src']
            aidl.srcDirs = ['src']
            renderscript.srcDirs = ['src']
            res.srcDirs = ['res']
            assets.srcDirs = ['assets']
            manifest.srcFile 'AndroidManifest.xml'
        }
    }
}
```

- 不要修改项目根目录下的build.gradle文件中的`dependencies`里的内容，*因为注释写着“Do not place your application dependencies here; they belong in the individual module build.gradle files”*
- 修改app目录下的build.gradle文件

```groovy
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile project(':SlidingMenu')//加上这句～
}
```

修改CustomViewAbove.java

```java
//位置: 类 FloatMath
 (float)Math.sin(f)
```

