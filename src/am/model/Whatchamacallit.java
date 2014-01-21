package am.model;

public class Whatchamacallit
	{

		public String getDescription()
		{
			return description;
		}

	public int getClassCounter()
		{
			return classCounter;
		}

	public void setDescription(String description)
		{
			this.description = description;
		}

	public void setClassCounter(int classCounter)
		{
			this.classCounter = classCounter;
		}

		private String description;
		private int classCounter;
		
		public Whatchamacallit()
			{
				this.description = "";
				this.classCounter = -10;
			}
	}
