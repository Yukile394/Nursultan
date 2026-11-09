package minecraft;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.caffeinemc.mods.lithium.mixin.block.hopper.NonNullListAccessor;
import org.jspecify.annotations.Nullable;

public class class00743<E> extends AbstractList<E> implements NonNullListAccessor {
   private final List<E> field_11115;
   @Nullable
   private final E field_11116;

   public class00743(List<E> var1, @Nullable E var2) {
      super();
      this.field_11115 = var1;
      this.field_11116 = (E)var2;
   }

   @Override
   public E remove(int var1) {
      return this.field_11115.remove(var1);
   }

   @Override
   public int size() {
      return this.field_11115.size();
   }

   @Override
   public E get(int var1) {
      return this.field_11115.get(var1);
   }

   @Override
   public void clear() {
      if (this.field_11116 == null) {
         super.clear();
      } else {
         for (int i = 0; i < this.size(); i++) {
            this.set(i, this.field_11116);
         }
      }
   }

   @Override
   public void add(int var1, E var2) {
      Objects.requireNonNull(var2);
      this.field_11115.add(var1, (E)var2);
   }

   @Override
   public E set(int var1, E var2) {
      Objects.requireNonNull(var2);
      return this.field_11115.set(var1, (E)var2);
   }

   public static <E> class00743<E> method_10213(int var0, E var1) {
      Objects.requireNonNull(var1);
      Object[] aobject = new Object[var0];
      Arrays.fill(aobject, var1);
      return new class00743<>(Arrays.asList((E[])aobject), (E)var1);
   }

   public static <E> class00743<E> method_10211() {
      return new class00743<>(Lists.newArrayList(), null);
   }

   @SafeVarargs
   public static <E> class00743<E> method_10212(E var0, E... var1) {
      return new class00743<>(Arrays.asList((E[])var1), (E)var0);
   }

   public static <E> class00743<E> method_37434(int var0) {
      return new class00743<>(Lists.newArrayListWithCapacity(var0), null);
   }
}
