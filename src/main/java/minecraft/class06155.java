package minecraft;

import java.util.concurrent.atomic.AtomicLong;

public record class06155(String name, AtomicLong preparationNanos, AtomicLong preparationCount, AtomicLong reloadNanos, AtomicLong reloadCount) {

   public AtomicLong L() {
      return this.preparationCount;
   }

   public class06155(String name, AtomicLong preparationNanos, AtomicLong preparationCount, AtomicLong reloadNanos, AtomicLong reloadCount) {
      this.name = name;
      this.preparationNanos = preparationNanos;
      this.preparationCount = preparationCount;
      this.reloadNanos = reloadNanos;
      this.reloadCount = reloadCount;
   }

   public AtomicLong i() {
      return this.reloadCount;
   }

   public AtomicLong u() {
      return this.reloadNanos;
   }

   public AtomicLong y() {
      return this.preparationNanos;
   }

   public String N() {
      return this.name;
   }
}
