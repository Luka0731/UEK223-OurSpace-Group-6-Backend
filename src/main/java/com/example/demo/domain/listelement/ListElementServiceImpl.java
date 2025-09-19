package com.example.demo.domain.listelement;

import com.example.demo.core.generic.AbstractServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Getter@Setter
@Service
public class ListElementServiceImpl extends AbstractServiceImpl<ListElement> implements ListElementService {

    @Autowired
    public ListElementServiceImpl(ListElementRepository repository) {
        super(repository);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
