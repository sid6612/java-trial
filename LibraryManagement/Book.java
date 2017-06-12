public class Book {

	Integer id;
	String name, author, taken;
	Integer member_id;

	public Book(int _id, String _name) 
   {
		this.id = _id;
		this.name = _name;
   }

   public boolean isAvailable()
   {
   	if(member_id == null)
      {
   		return true;
   	} 
      else
      {
         return false;
   	}
   }

   public void assign(Member selectedMember){
   	member_id = selectedMember.id;
		System.out.println("Book assigned to " + selectedMember.name);
   }

   public boolean taken()
   {
      if(member_id == null)
      {
         System.out.println("No");
         return false;
      }
      else
      {
         System.out.println("Yes");
         return true;
      }
   }
}