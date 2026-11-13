package in.coderarmy.gatekeeper.management.controller;

import in.coderarmy.gatekeeper.management.dto.requestDto.LoginRequest;
import in.coderarmy.gatekeeper.management.dto.responseDto.LoginResponse;
import in.coderarmy.gatekeeper.management.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }
}
