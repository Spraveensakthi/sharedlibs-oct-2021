def call(name){
  
node('slave'){
  echo "Hey ${name}, Welcome to Jenkins Shared Libs"
}
}
