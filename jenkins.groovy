node {
    stage("My Stage") {
        echo "HELLO MICHAEL Duck"
        git 'https://github.com/nivmichael/my-cool-app.git'
    }
}