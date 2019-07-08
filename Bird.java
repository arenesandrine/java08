		package wildcodeschool.java08;
		
		public abstract class Bird {
			
		
				  
		
			    // attributs  
		
			    private String name;  
		
			    private int age;
		
			  
		
			    // constructeurs  
		
			    public Bird(String name) {  
		
			        this.name = name;  
		
			        this.age = 0;  
		
			    }  
		
			  
		
			    // accesseurs et mutateurs  
		
			    public String getName() {  
		
			        return this.name;  
		
			    }  
		
			  
		
			    public void setName(String name) {  
		
			        this.name = name;  
		
			    }  
		
			  
		
			    public int getAge() {  
		
			        return this.age;  
		
			    }  
		
			  
		
			    public void setAge(int age) {
		
			        this.age = age;
		
			    }
		
		
		
			    // méthodes
		
			    public abstract String sing();
		
		
		
				public int Flyascend(int meters) {
					// TODO Auto-generated method stub
					return 0;
				}
		
		
		
				public int Flydescend(int meters) {
					// TODO Auto-generated method stub
					return 0;
				}
		
		}
