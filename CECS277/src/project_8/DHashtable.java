package project_8;

public class DHashtable <T>{
	private Object[] entries;
	private int currentSize;

	public DHashtable(int entrieslength){
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
		else if(currentSize == entries.length){
			return false;
		}
		else
		{
			int k = compress2(x);
			h += k;
			h %= entries.length;
			while(entries[h] != null){
				h += k;
				h %= entries.length;
			}
			entries[h] = x;
			currentSize++;
			return true;
		}


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
		System.out.println();
	}
	
	private int compress(Object x){
		int h = x.hashCode();
		if (h < 0) { h = -h; }
		h = h % entries.length;
		return h;
	}

	private int compress2(Object x){
		int h = x.hashCode();
		if(h < 0){h = -h;}
		h = 3 - h % 3;
		return h;
	}
}
