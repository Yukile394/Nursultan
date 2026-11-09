package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;

class class04597 extends class05724<class04616> {
   public class04597(class04610 var1, class06202 var2) {
      super(var2, var1.field_22789, var1.M.u(), 33, 14);
      this.N = var1;
      ObjectArrayList objectarraylist = new ObjectArrayList(class01235.Z.iterator());
      objectarraylist.sort(Comparator.comparing(var0 -> class08392.N(class04610.N((class04907<class01894>)var0))));
      ObjectListIterator objectlistiterator = objectarraylist.iterator();

      while (objectlistiterator.hasNext()) {
         class04907 class04907 = (class04907)objectlistiterator.next();
         this.method_25321(new class04616(this, class04907));
      }
   }

   @Override
   public int method_25322() {
      return 280;
   }

   @Override
   protected void method_57715(class01054 var1) {
   }

   @Override
   protected void method_57713(class01054 var1) {
   }
}
