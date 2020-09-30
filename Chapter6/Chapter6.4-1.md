```java
// Test remove(): testRemove_C2(): C1-F, C2-T, C3-T, C4-T, C5-T
@Test 
public void testRemove_C2()
{
   list.add(null);
   list.add(pig);
   itr = list.iterator();
   itr.next(); // consume the cat
   itr.remove(); // remove cat from list
   itr.next(); // consume null
   itr.remove(); // remove null from list; list is not empty
   assertFalse (list.contains (null));
}
```