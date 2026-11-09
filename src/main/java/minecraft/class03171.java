package minecraft;

import Nursultan.class10153;
import java.util.ArrayDeque;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public class class03171 implements class03175 {
   private final Deque<class03169> N = new ArrayDeque<>();

   private void L(class01424<?> var1) {
      if (var1 == class07741.N) {
         this.N.addLast(new class03184());
      } else if (var1 == class07001.y) {
         this.N.addLast(new class03166());
      }
   }

   public class03171() {
      super();
      this.N.addLast(new class10153());
   }

   protected int i() {
      return this.N.size() - 1;
   }

   @Nullable
   public class07709 u() {
      return this.N.getFirst().N();
   }

   @Override
   public class03153 y(class01424<?> var1, int var2) {
      this.L(var1);
      return class03153.field_36248;
   }

   @Override
   public class03154 y(class01424<?> var1) {
      this.L(var1);
      return class03154.field_36253;
   }

   @Override
   public class03154 y() {
      class07709 class07709 = this.N.removeLast().N();
      if (class07709 != null) {
         this.N.getLast().N(class07709);
      }

      return class03154.field_36253;
   }

   @Override
   public class03153 N(class01424<?> var1) {
      return class03153.field_36248;
   }

   @Override
   public class03154 N(String var1) {
      this.N(class07707.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(class01424<?> var1, int var2) {
      return class03154.field_36253;
   }

   @Override
   public class03154 N(long[] var1) {
      this.N(new class07757(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(double var1) {
      this.N(class07019.N(var1));
      return class03154.field_36253;
   }

   private void N(class07709 var1) {
      this.N.getLast().N(var1);
   }

   @Override
   public class03154 N() {
      this.N(class06997.y);
      return class03154.field_36253;
   }

   @Override
   public class03153 N(class01424<?> var1, String var2) {
      this.N.getLast().N(var2);
      this.L(var1);
      return class03153.field_36248;
   }

   @Override
   public class03154 N(float var1) {
      this.N(class07009.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(long var1) {
      this.N(class07729.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(int var1) {
      this.N(class07720.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(short var1) {
      this.N(class07730.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(byte var1) {
      this.N(class07037.N(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(byte[] var1) {
      this.N(new class07029(var1));
      return class03154.field_36253;
   }

   @Override
   public class03154 N(int[] var1) {
      this.N(new class06995(var1));
      return class03154.field_36253;
   }
}
