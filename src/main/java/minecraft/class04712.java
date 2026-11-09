package minecraft;

import org.jspecify.annotations.Nullable;

public record class04712(int statusCode, String errorMessage) {
   @Nullable
   public String L() {
      return this.errorMessage;
   }

   public class04712(int statusCode, @Nullable String errorMessage) {
      super();
      this.statusCode = statusCode;
      this.errorMessage = errorMessage;
   }

   public int y() {
      return this.statusCode;
   }

   @Nullable
   public String N() {
      if (this.statusCode >= 200 && this.statusCode < 300) {
         return null;
      } else {
         return this.statusCode == 400 && this.errorMessage != null ? this.errorMessage : String.valueOf(this.statusCode);
      }
   }
}
