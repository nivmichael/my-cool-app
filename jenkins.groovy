node {
    stage("My Stage") {
        echo "HELLO MICHAEL"
        git 'https://github.com/nivmichael/my-cool-app.git'
    }
}