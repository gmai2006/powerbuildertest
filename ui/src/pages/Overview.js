import React from 'react';
import {Container, Row, Col, Image} from 'react-bootstrap';
import CardBox from '../components/Card';
import DatabaseSchema from '../assets/schema.png';

const Overview = () => {
    return (
        <React.Fragment>
            <Container className='mt-5'>
                
                <Container>
                    <Row>
                        <Col xs={12}>
                            <Image src={DatabaseSchema} />
                        </Col>
                       
                    </Row>
                </Container>
            </Container>
        </React.Fragment>
    )
}

export default Overview;
