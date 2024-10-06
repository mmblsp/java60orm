package mmblspace.local.dao_hibernate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import jakarta.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/md")
public class ControllerSecure {

    @GetMapping("/")
    public ResponseEntity<String> mdMain(Authentication authentication) {
        return ResponseEntity.ok("Hello from secure app, " + authentication.getName() + ":" + authentication.getAuthorities());
    }

    @Secured("ROLE_READ")
    @GetMapping("/hello-read")
    public String greetingRead() {
        return "Hello from secure app, READ";
    }

    @RolesAllowed("ROLE_WRITE")
    @GetMapping("/hello-write")
    public String greetingWrite() {
        return "Hello from secure app, WRITE.";
    }

    @PreAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    @GetMapping("/hello-wd")
    public String greetingWriteDelete(String username) {
        return "Hello from secure app, Write or Delete, "+ username;
    }

}
