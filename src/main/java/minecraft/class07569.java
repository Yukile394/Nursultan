package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;

public class class07569 implements class08152 {
   private final ReferenceSet<class08152> N = new ReferenceArraySet();

   private class07569(ReferenceSet<class08152> var1, ReferenceSet<class08152> var2) {
      super();
      this.N.addAll(var1);
      this.N.addAll(var2);
      this.y();
   }

   private class07569(ReferenceSet<class08152> var1, class08152 var2) {
      super();
      this.N.addAll(var1);
      this.N.add(var2);
      this.y();
   }

   class07569(class08152 var1, class08152 var2) {
      super();
      this.N.add(var1);
      this.N.add(var2);
      this.y();
   }

   private void y() {
      ObjectIterator<class08152> objectiterator = this.N.iterator();

      while (objectiterator.hasNext()) {
         if ((class08152)objectiterator.next() instanceof class07569) {
            throw new IllegalArgumentException("Cannot have PermissionSetUnion within another PermissionSetUnion");
         }
      }
   }

   @Override
   public class08152 N(class08152 var1) {
      return var1 instanceof class07569 class07569 ? new class07569(this.N, class07569.N) : new class07569(this.N, var1);
   }

   public ReferenceSet<class08152> N() {
      return new ReferenceArraySet(this.N);
   }

   @Override
   public boolean hasPermission(class08159 var1) {
      ObjectIterator<class08152> objectiterator = this.N.iterator();

      while (objectiterator.hasNext()) {
         if (((class08152)objectiterator.next()).hasPermission(var1)) {
            return true;
         }
      }

      return false;
   }
}
