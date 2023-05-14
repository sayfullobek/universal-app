package ul.it.universalserver.component;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import ul.it.universalserver.entity.Role;
import ul.it.universalserver.entity.User;
import ul.it.universalserver.entity.enums.RoleName;
import ul.it.universalserver.repository.RoleRepository;
import ul.it.universalserver.repository.UserRepository;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String initMode;

    @Override
    public void run(String... args) {
        if (initMode.equals("create-drop") || initMode.equals("create")) {
            for (RoleName value : RoleName.values()) {
                roleRepository.save(
                        new Role(
                                value
                        )
                );
            }
            userRepository.save(
                    new User(
                            "Sayfullo",
                            "To'xtayev",
                            "sayfullobek__",
                            passwordEncoder.encode("admin123"),
                            roleRepository.findById(1).orElseThrow(() -> new ResourceNotFoundException("getRole"))
                    )
            );
        }
    }
}