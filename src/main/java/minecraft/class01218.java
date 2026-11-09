package minecraft;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;

class class01218<E> extends AbstractList<E> {
   private final List<E> y;

   class01218(class01212 var1) {
      super();
      this.N = var1;
      this.y = Lists.newArrayList();
   }

   @Override
   public int size() {
      return this.y.size();
   }

   public E remove(int var1) {
      return (E)((class01202)this.y.remove(var1));
   }

   public void add(int var1, E var2) {
      this.y.add(var1, (E)var2);
      this.N.method_29621(var2);
   }

   public E get(int var1) {
      return (E)((class01202)this.y.get(var1));
   }

   public E set(int var1, E var2) {
      class01202 class01202 = (class01202)this.y.set(var1, (E)var2);
      this.N.method_29621(var2);
      return (E)class01202;
   }
}
