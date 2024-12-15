package br.com.miniautorizador.service;

import br.com.miniautorizador.domain.User;
import br.com.miniautorizador.dto.UserDTO;
import br.com.miniautorizador.repository.UserRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setLogin(userDTO.getLogin());
        user.setPassword(userDTO.getPassword());

        User savedUser = userRepository.save(user);

        UserDTO responseDTO = new UserDTO();
        responseDTO.setLogin(savedUser.getLogin());
        responseDTO.setPassword(savedUser.getPassword());

        return responseDTO;
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
