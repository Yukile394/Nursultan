package minecraft;

import java.util.BitSet;

public record class03058(int offset, BitSet acknowledged, byte checksum) {
   public static final byte N = 0;

   public byte L() {
      return this.checksum;
   }

   public class03058(class00667 var1) {
      this(var1.E(), var1.i(20), var1.readByte());
   }

   public class03058(int offset, BitSet acknowledged, byte checksum) {
      super();
      this.offset = offset;
      this.acknowledged = acknowledged;
      this.checksum = checksum;
   }

   public BitSet y() {
      return this.acknowledged;
   }

   public void N(class00667 var1) {
      var1.L(this.offset);
      var1.N(this.acknowledged, 20);
      var1.writeByte(this.checksum);
   }

   public boolean N(class03048 var1) {
      return this.checksum == 0 || this.checksum == var1.N();
   }

   public int N() {
      return this.offset;
   }
}
