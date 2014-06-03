/TEST FOR BRANCHIN

boolean match=false
int cont=0
//TRY TO GUESS A NUMBER
println "Try to guess a number between 1 and 1000"
println "Please introduce a number"
int guess= Integer.parseInt(System.console().readLine())
int num= Math.abs(1000 * Math.random())
while(!match){
if ( guess== num){
	println"Congratulations"
	match=true
}
else if (guess<num){
	println "Higher"
	cont ++
}
else if (guess>num){
		println "Lower"
		cont ++
}
 if (!match) {
println "Try again"
guess =Integer.parseInt(System.console().readLine())}

}
println "Correct"+"     "+ "You needed "+cont "guesses"
println "CONGRATULATIONS"