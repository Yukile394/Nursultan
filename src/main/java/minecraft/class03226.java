package minecraft;

import jdk.jfr.consumer.RecordedEvent;

public record class03226(double jvm, double userJvm, double system) {
   public double L() {
      return this.system;
   }

   public class03226(double jvm, double userJvm, double system) {
      this.jvm = jvm;
      this.userJvm = userJvm;
      this.system = system;
   }

   public double y() {
      return this.userJvm;
   }

   public double N() {
      return this.jvm;
   }

   public static class03226 N(RecordedEvent var0) {
      return new class03226(var0.getFloat("jvmSystem"), var0.getFloat("jvmUser"), var0.getFloat("machineTotal"));
   }
}
