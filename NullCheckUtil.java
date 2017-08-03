public static boolean notEmpty(String value){
	return (value ! = null && value.trim().length > 0 );
}

public static boolean isEmpty(String value){
	return (!notEmpty(value));
}
