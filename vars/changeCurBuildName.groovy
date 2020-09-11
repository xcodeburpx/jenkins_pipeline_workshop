def call(String buildNumber) {
    currentBuild.dislayName = "#BUILD_NUMBER-${buildNumber}"
}