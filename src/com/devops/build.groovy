package com.devops

def GoBuild(buildType, buildArgs) {

    def buildTools = ["mvn":"M2", "ant":"ANT", "gradle":"GRADLE"]

    println("選擇建構類型為 ${buildType}，參數為 ${buildArgs}")

    BuildHome = tool buildTools[buildType]
    sh "${BuildHome}/bin/${buildType} ${buildArgs}"

}
