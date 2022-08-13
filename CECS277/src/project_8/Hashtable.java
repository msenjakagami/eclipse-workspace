package project_8;

public class Hashtable<T> {

	private T data;
	private Object[] entries;
	private int currentSize;

	public Hashtable(int entrieslength){
		entries = new Object[entrieslength];
		currentSize = 0;
	}

	public boolean contains(Object x)
	{
		int h = compress(x);
		if(entries[h] == null){
			return false;
		}
		else{
			return true;
		}
	}

	public boolean add(Object x)
	{
		int h = compress(x);
		if(entries[h] == null)
		{
			entries[h] = x;
			currentSize++;
			return true;
		}
		else
		{
			int h1 = h + 1;
			for(int i = h1; i < entries.length; i++){
				if(entries[i] == null){
					entries[i] = x;
					currentSize++;
					return true;
				}
			}
			for(int ii = 0; ii < h; ii++){
				if(entries[ii] == null){
					entries[ii] = x;
					currentSize++;
					return true;
				}
			}
		}
		return false;


	}

	public boolean remove(Object x)
	{
		int h = compress(x);
		if(entries[h] == null){
			return false;
		}
		else{
			for(int i = h + 1; i < entries.length; i++){
				if(entries[i] != null){
					int l = compress(entries[i]);
					if(l == h){
						entries[h] = entries[i];
						entries[i] = null;
						currentSize--;
						return true;
					}
				}
			}
			for(int j = 0; j < h; j++){
				if(entries[j] != null){
					int k = compress(entries[j]);
					if(k == h){
						entries[h] = entries[j];
						entries[j] = null;
						currentSize--;
						return true;
					}
				}
			}
			entries[h] = null;
			currentSize--;
			return true;
		}
	}

	public int size()
	{
		return currentSize;
	}

	public void print(){
		int i = 1;
		for(Object x: entries){
			System.out.println(i + ". " + x);
			i++;
		}
	}
	
	private int compress(Object x){
		int h = x.hashCode();
		if (h < 0) { h = -h; }
		h = h % entries.length;
		return h;
	}
}


