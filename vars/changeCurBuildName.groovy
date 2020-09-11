def call(String buildNumber) {
    currentBuild.displayName = "#BUILD_NUMBER-${buildNumber}"
}