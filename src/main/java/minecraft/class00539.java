package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public record class00539(
   int containerId, int stateId, short slotNum, byte buttonNum, class07510 clickType, Int2ObjectMap<class00176> changedSlots, class00176 carriedItem
) implements class00381<class08051> {
   private static final int Z = 128;
   private static final class02362<class04247, Int2ObjectMap<class00176>> z = class02389.N(
      Int2ObjectOpenHashMap::new, class02389.i.N_10(Short::intValue, Integer::shortValue), class00176.y, 128
   );
   public static final class02362<class04247, class00539> N = class02362.N(
      class02389.l,
      class00539::N,
      class02389.B,
      class00539::y,
      class02389.i,
      class00539::L,
      class02389.L,
      class00539::u,
      class07510.field_58134,
      class00539::M,
      z,
      class00539::B,
      class00176.y,
      class00539::Z,
      class00539::new
   );

   public short L() {
      return this.slotNum;
   }

   public class07510 M() {
      return this.clickType;
   }

   public class00539(
      int containerId, int stateId, short slotNum, byte buttonNum, class07510 clickType, Int2ObjectMap<class00176> changedSlots, class00176 carriedItem
   ) {
      changedSlots = Int2ObjectMaps.unmodifiable(changedSlots);
      this.containerId = containerId;
      this.stateId = stateId;
      this.slotNum = slotNum;
      this.buttonNum = buttonNum;
      this.clickType = clickType;
      this.changedSlots = changedSlots;
      this.carriedItem = carriedItem;
   }

   public Int2ObjectMap<class00176> B() {
      return this.changedSlots;
   }

   public class00176 Z() {
      return this.carriedItem;
   }

   public byte u() {
      return this.buttonNum;
   }

   public int y() {
      return this.stateId;
   }

   public int N() {
      return this.containerId;
   }

   public void method_65081(class08051 var1) {
      var1.method_12076(this);
   }

   @Override
   public class02897<class00539> method_65080() {
      return class04248.yJ;
   }
}
