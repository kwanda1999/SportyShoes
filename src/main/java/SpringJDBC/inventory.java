package SpringJDBC;

public class inventory {
	private int id;
	private String name;
	private float price;
	
		protected inventory (String  proname, float price) {
			this.name = proname;
			this.price = price;
		}
		
		protected inventory() {
		}
		
		@Override
		public String toString() {
			return name;

			
		}

		public String getProname() {
			return name;
		}

		public void setProname(String proname) {
			this.name = proname;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

}
