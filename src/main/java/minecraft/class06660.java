package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public record class06660(int id, List<class02998<?>> packedItems) implements class00381<class07280> {
   public static final class02362<class04247, class06660> N = class00381.N(class06660::y, class06660::new);
   public static final int y = 255;

   private class06660(class04247 var1) {
      this(var1.E(), N(var1));
   }

   public class06660(int id, List<class02998<?>> packedItems) {
      super();
      this.id = id;
      this.packedItems = packedItems;
   }

   private void y(class04247 var1) {
      var1.L(this.id);
      N(this.packedItems, var1);
   }

   public List<class02998<?>> y() {
      return this.packedItems;
   }

   private static List<class02998<?>> N(class04247 var0) {
      ArrayList arraylist = new ArrayList();

      short short1;
      while ((short1 = var0.readUnsignedByte()) != 255) {
         arraylist.add(class02998.N(var0, short1));
      }

      return arraylist;
   }

   public int N() {
      return this.id;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private static void N(List<class02998<?>> var0, class04247 var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         ((class02998)iterator.next()).N(var1);
      }

      var1.writeByte(255);
   }

   @Override
   public class02897<class06660> method_65080() {
      return class04248.NV;
   }
}
