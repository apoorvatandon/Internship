class TreeNode   
{    
int val;  

TreeNode left, right;  

public TreeNode(int i)  
{  
val = i;  
right = left = null;  
}  
}  
  
public class BTreeLevelOrder    
{  

TreeNode r;  
 
public BTreeLevelOrder() { r = null; }  

void displayLevelOrder()  
{  
int ht = treeHeight(r);  
int j;  
  
for (j = 1; j <= ht; j++)  
{  
displayCurrentLevel(r, j);  
}  
}  
  
int treeHeight(TreeNode r)  
{  
if (r == null)  
{  
return 0;  
}  
else   
{  
 
int lh = treeHeight(r.left);  
int rh = treeHeight(r.right);  
if (lh > rh)  
{  
return (lh + 1);  
}  
else  
{  
return (rh + 1);  
}  
}  
}  
  
void displayCurrentLevel(TreeNode r, int l)  
{  

if (r == null)  
{  
return;  
}  

if (l == 1)  
{  
System.out.print(r.val + " ");  
}  
  
else if (l > 1)   
{  
displayCurrentLevel(r.left, l - 1);  
displayCurrentLevel(r.right, l - 1);  
}  
} 
}
