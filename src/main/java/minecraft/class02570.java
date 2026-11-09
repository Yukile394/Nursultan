package minecraft;

import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record class02570(class00392 reason, Optional<Path> report, Optional<URI> bugReportLink) {
   public Optional<URI> L() {
      return this.bugReportLink;
   }

   public class02570(class00392 var1) {
      this(var1, Optional.empty(), Optional.empty());
   }

   public class02570(class00392 reason, Optional<Path> report, Optional<URI> bugReportLink) {
      super();
      this.reason = reason;
      this.report = report;
      this.bugReportLink = bugReportLink;
   }

   public Optional<Path> y() {
      return this.report;
   }

   public class00392 N() {
      return this.reason;
   }
}
