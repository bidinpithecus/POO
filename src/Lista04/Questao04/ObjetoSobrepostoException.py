class ObjetoSobrepostoException(Exception):
    def __init__(self, mensagem):
        super().__init__
        self.mensagem = mensagem

    def __str__(self):
        return self.mensagem