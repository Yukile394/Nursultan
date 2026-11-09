package minecraft;

public record class07129(String providerId, class07096 cache, int writes) {
   public int L() {
      return this.writes;
   }

   public class07129(String providerId, class07096 cache, int writes) {
      super();
      this.providerId = providerId;
      this.cache = cache;
      this.writes = writes;
   }

   public class07096 y() {
      return this.cache;
   }

   public String N() {
      return this.providerId;
   }
}
