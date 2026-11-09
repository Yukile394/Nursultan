package minecraft;

import java.util.function.BooleanSupplier;

record class01884(class00381<? extends class01636> packet, BooleanSupplier sendCondition, long expirationTime) {

   public long L() {
      return this.expirationTime;
   }

   class01884(class00381<? extends class01636> packet, BooleanSupplier sendCondition, long expirationTime) {
      this.packet = packet;
      this.sendCondition = sendCondition;
      this.expirationTime = expirationTime;
   }

   public BooleanSupplier y() {
      return this.sendCondition;
   }

   public class00381<? extends class01636> N() {
      return this.packet;
   }
}
