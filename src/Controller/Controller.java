package Controller;

import Repository.IRepository;

public class Controller {
    IRepository repository;

    public Controller(IRepository repository) {
        this.repository = repository;
    }

    public int Result()
    {
        return repository.Result();
    }
    public String Print()
    {
        return repository.Print();
    }

}
