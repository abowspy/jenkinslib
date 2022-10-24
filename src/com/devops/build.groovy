package com.devops

// 有兩個參數分別定義，構建類型跟構建時使用的參數
def GoBuild(buildType, buildArgs) {

    def buildTools = ["mvn":"M2", "ant":"ANT", "gradle":"GRADLE"]

    println("選擇建構類型為 ${buildType}，參數為 ${buildArgs}")

    BuildHome = tool buildTools[buildType]
    sh "${BuildHome}/bin/${buildType} ${buildArgs}"

}
