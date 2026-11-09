package minecraft;

public record class06643(class04167 commonPlayerSpawnInfo, byte dataToKeep) implements class00381<class07280> {
   public static final class02362<class04247, class06643> N = class00381.N(class06643::N, class06643::new);
   public static final byte y = 1;
   public static final byte L = 2;
   public static final byte u = 3;

   private class06643(class04247 var1) {
      this(new class04167(var1), var1.readByte());
   }

   public class06643(class04167 commonPlayerSpawnInfo, byte dataToKeep) {
      super();
      this.commonPlayerSpawnInfo = commonPlayerSpawnInfo;
      this.dataToKeep = dataToKeep;
   }

   public byte y() {
      return this.dataToKeep;
   }

   public class04167 N() {
      return this.commonPlayerSpawnInfo;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class04247 var1) {
      this.commonPlayerSpawnInfo.N(var1);
      var1.writeByte(this.dataToKeep);
   }

   public boolean N(byte var1) {
      return (this.dataToKeep & var1) != 0;
   }

   @Override
   public class02897<class06643> method_65080() {
      return class04248.Nn;
   }
}
