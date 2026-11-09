package minecraft;

public record class02333<S>(int cursor, class02350<S> suggestions, Object reason) {
   public Object L() {
      return this.reason;
   }

   public class02333(int cursor, class02350<S> suggestions, Object reason) {
      this.cursor = cursor;
      this.suggestions = suggestions;
      this.reason = reason;
   }

   public class02350<S> y() {
      return this.suggestions;
   }

   public int N() {
      return this.cursor;
   }
}
