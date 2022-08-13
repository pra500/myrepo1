package datastructure;

public class Queue {	
		
		//queue implementation using array
		
		int capacity;
		int currentsize;
		int front;
		int rear;
		int a[];
		
		
		public Queue(int sizeofqueue){
			
			this.capacity=sizeofqueue;
			front=0;
			rear=-1;
			a=new int[this.capacity];				
			
		}
		
		public boolean isFull()
		{
			if(currentsize==capacity)
			{
				return true;
			}
			else
			{
				return false;				
			}
		}
	
		public boolean isEmpty()
		{
			if(currentsize==0)
			{
			   return true;
			}
			else
			{
				return false;
			}
			
		}
		
		/**
		 * 
		 * this mtd for insertion
		 * 
		 * 
		 * 
		 * @param d
		 */
		
		public void enqueue(int d)
		{			
			if(isFull())
			{
				System.out.println("queue is full, can't insert the data");	
			}
			else
			{
				rear++;
				if(rear == capacity-1)
				{
					rear=0;
				}
				a[rear]=d;
				currentsize++;
				System.out.println(d + "" + "has been added to the queue");
				
				
			}			
			
			
		}
		
		/**
		 * 
		 * this mtd for deletion
		 *
		 */
		public void dequeue()
		{
			if(isEmpty())
			{
				System.out.println("queue is already empty, can't delete any data");
			}
			else
			{
				front++;
				if(front == capacity-1)
				{
										
					System.out.println(a[front-1] +""+ "has been removed from the queue");
					front=0;
				}
				else
				{
					System.out.println(a[front-1] +""+ "has been removed from the queue");					
				}				
					
				currentsize--;				
				
			}			
			
		}		
		
		public static void main(String[] args) {	
		
			Queue q=new Queue(5);
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.dequeue();			
			
			q.enqueue(40);
			q.dequeue();
			
		

	}

}
