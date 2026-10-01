class StrBufferBuild {
	public static void main(String[] args) 
	{
		StringBuffer name= new StringBuffer("Anuj");
//		System.out.println(name.length());
//		System.out.println(name.capacity());


		name.append("Mishra");
		System.out.println(name);
		
//		String str=name.toString();
		
//		name.deleteCharAt(4);
//		name.insert(0,"Java");

//		name.setLength(30);
		name.ensureCapacity(88);
		
		System.out.println(name);
	}
}