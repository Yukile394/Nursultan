package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.ArrayVoxelShapeInvoker;

public class class06864 extends class00494 implements ArrayVoxelShapeInvoker {
   private final DoubleList N;
   private final DoubleList y;
   private final DoubleList L;

   @Override
   public DoubleList method_1109(class07185 var1) {
      return switch (var1) {
         case field_11048 -> this.N;
         case field_11052 -> this.y;
         case field_11051 -> this.L;
      };
   }

   protected class06864(class07739 var1, double[] var2, double[] var3, double[] var4) {
      this(
         var1,
         DoubleArrayList.wrap(Arrays.copyOf(var2, var1.method_1050() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var3, var1.method_1047() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var4, var1.method_1048() + 1))
      );
   }

   class06864(class07739 var1, DoubleList var2, DoubleList var3, DoubleList var4) {
      super(var1);
      int i = var1.method_1050() + 1;
      int j = var1.method_1047() + 1;
      int k = var1.method_1048() + 1;
      if (i == var2.size() && j == var3.size() && k == var4.size()) {
         this.N = var2;
         this.y = var3;
         this.L = var4;
      } else {
         throw (IllegalArgumentException)class07536.y(
            new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.")
         );
      }
   }
}
