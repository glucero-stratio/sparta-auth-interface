@Library('libpipelines@master') _

hose {
    EMAIL = 'sparta'
    MODULE = 'sparta-auth'
    DEVTIMEOUT = 20
    RELEASETIMEOUT = 20
    FOSS = true
    REPOSITORY = 'sparta-auth-interface'
    MAVEN_THREADSPERCORE = 4
    BUILDTOOLVERSION = '3.5.0'
    NEW_VERSIONING = 'true'

    DEV = { config ->
        doCompile(config)
        doPackage(config)
        doDeploy(config)            
    }
}
