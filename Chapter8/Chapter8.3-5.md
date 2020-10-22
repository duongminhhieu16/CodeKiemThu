```java
public static void checkItExpand (bool a, bool b, bool c)
{
	System.out.println ("Node 1 is visited.");
	if (a)
	{
		System.out.println ("Node 2 is visited.");
		if (b)
		{
			System.out.println ("Node 3 is visited.");
			System.out.println ("P is true");
		}
		else if (c)
		{
			System.out.println ("Node 3 is visited.");
			System.out.println ("P is true");
		}
		else
		{
			System.out.println ("Node 4 is visited.");
			System.out.println ("P isn't true");
		}
	}
	else
	{
		System.out.println ("Node 4 is visited.");
		System.out.println ("P isn't true");
	}
}
```