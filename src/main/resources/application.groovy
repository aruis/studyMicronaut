micronaut {
    executors {
        io {
            type = "fixed"
            nThreads = 75
        }
    }
    server {
        port = 6060
    }
}